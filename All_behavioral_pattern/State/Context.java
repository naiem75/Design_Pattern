public class Context {
    private State currentState;

    public Context() {
        currentState = new StateA(); // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void request() {
        currentState.handle();
    }
}
