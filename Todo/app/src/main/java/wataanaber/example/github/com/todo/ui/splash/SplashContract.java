package wataanaber.example.github.com.todo.ui.splash;

import android.app.Activity;

public interface SplashContract {

    interface View {
        void showError(String message);
    }

    interface Presenter {
        void onResume(); // base

        void onPause(); // base

        void openTodoList();
    }

    interface Interactor {
        void startInteraction(InteractorOutput out); // base

        void stopInteraction(InteractorOutput out); // base
    }

    interface InteractorOutput {
    }

    interface Router {
        void openTodoList(Activity activity);
    }

}
