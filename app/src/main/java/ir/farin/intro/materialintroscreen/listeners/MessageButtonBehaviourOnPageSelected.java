package ir.farin.intro.materialintroscreen.listeners;

import android.util.SparseArray;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import ir.farin.intro.R;
import ir.farin.intro.materialintroscreen.MessageButtonBehaviour;
import ir.farin.intro.materialintroscreen.SlideFragment;
import ir.farin.intro.materialintroscreen.adapter.SlidesAdapter;

import static ir.farin.intro.materialintroscreen.SlideFragment.isNotNullOrEmpty;


public class MessageButtonBehaviourOnPageSelected implements IPageSelectedListener {
    private Button messageButton;
    private SlidesAdapter adapter;
    private SparseArray<MessageButtonBehaviour> messageButtonBehaviours;

    public MessageButtonBehaviourOnPageSelected(Button messageButton, SlidesAdapter adapter, SparseArray<MessageButtonBehaviour> messageButtonBehaviours) {
        this.messageButton = messageButton;
        this.adapter = adapter;
        this.messageButtonBehaviours = messageButtonBehaviours;
    }

    @Override
    public void pageSelected(int position) {
        final SlideFragment slideFragment = adapter.getItem(position);

        if (slideFragment.hasAnyPermissionsToGrant()) {
            showMessageButton(slideFragment);
            messageButton.setText(slideFragment.getActivity().getString(R.string.grant_permissions));
            messageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    slideFragment.askForPermissions();
                }
            });
        } else if (checkIfMessageButtonHasBehaviour(position)) {
            showMessageButton(slideFragment);
            messageButton.setText(messageButtonBehaviours.get(position).getMessageButtonText());
            messageButton.setOnClickListener(messageButtonBehaviours.get(position).getClickListener());
        } else if (messageButton.getVisibility() != View.INVISIBLE) {
            messageButton.startAnimation(AnimationUtils.loadAnimation(slideFragment.getContext(),R.anim.fade_out));
            messageButton.setVisibility(View.INVISIBLE);
        }
    }

    private boolean checkIfMessageButtonHasBehaviour(int position) {
        return messageButtonBehaviours.get(position) != null && isNotNullOrEmpty(messageButtonBehaviours.get(position).getMessageButtonText());
    }

    private void showMessageButton(final SlideFragment fragment) {
        if (messageButton.getVisibility() != View.VISIBLE) {
            messageButton.setVisibility(View.VISIBLE);
            if (fragment.getActivity() != null) {
                messageButton.startAnimation(AnimationUtils.loadAnimation(fragment.getActivity(),R.anim.fade_in));

            }
        }
    }
}