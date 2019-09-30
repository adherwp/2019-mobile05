package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.fragments.Dips;
import polinema.ac.id.starterchapter05.fragments.Handstand;
import polinema.ac.id.starterchapter05.fragments.Pushups;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new Handstand(),"HANDSTAND");
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void handlerPushups(View view) {
        Pushups check=(Pushups) getSupportFragmentManager().findFragmentByTag("PUSHUP");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (check!=null && check.isVisible()){

        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new Pushups(), "PUSHUP");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {
        Dips check=(Dips) getSupportFragmentManager().findFragmentByTag("DIPS");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (check!=null && check.isVisible()){

        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new Dips(), "DIPS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerHandstand(View view) {
        Handstand check=(Handstand) getSupportFragmentManager().findFragmentByTag("HANDSTAND");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        if (check!=null && check.isVisible()){

        }else{
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new Handstand(), "HANDSTAND");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
