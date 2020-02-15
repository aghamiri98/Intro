package ir.farin.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;

import ir.farin.intro.materialintroscreen.MaterialIntroActivity;
import ir.farin.intro.materialintroscreen.SlideFragmentBuilder;
public class IntroActivity extends MaterialIntroActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    addSlide(new SlideFragmentBuilder()
        .backgroundColor(R.color.colorPrimary)

        .buttonsColor(R.color.introButtonColor)
        .image(R.drawable.intro01)
        .title("What is Lorem Ipsum?")
        .description("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries")
        .build());


  addSlide(new SlideFragmentBuilder()
        .backgroundColor(R.color.colorPrimary)
        .buttonsColor(R.color.introButtonColor)
        .image(R.drawable.intro02)
        .title("Why do we use it?")
        .description("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters")
        .build());


  addSlide(new SlideFragmentBuilder()
        .backgroundColor(R.color.colorPrimary)
        .buttonsColor(R.color.introButtonColor)
        .image(R.drawable.intro03)
        .title("Where does it come from?")
        .description("Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur")
        .build());



addSlide(new SlideFragmentBuilder()
        .backgroundColor(R.color.colorPrimary)
        .buttonsColor(R.color.introButtonColor)
        .image(R.drawable.intro06)
        .title("Where can I get some?")
        .description("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour")
        .build());


addSlide(new SlideFragmentBuilder()
        .backgroundColor(R.color.colorPrimary)
        .buttonsColor(R.color.introButtonColor)
        .image(R.drawable.intro07)
        .title("The standard Lorem Ipsum passage")
        .description("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua")
        .build());














  }














}
