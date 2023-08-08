public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("TypeB")) {
            System.out.println("ConcreteHandlerB handles request of type " + request.getType());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}