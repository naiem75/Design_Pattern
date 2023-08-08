public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.request(); // Output depends on the initial state (State A)

        State newState = new StateB();
        context.setState(newState);

        context.request(); // Output depends on the new state (State B)
    }
}
