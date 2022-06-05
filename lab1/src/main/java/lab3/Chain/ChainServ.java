package lab3.Chain;

public class ChainServ {

    public Request exec(String inputStream) {
        Request request = new Request();
        request.setInputStream(inputStream);

        ChainH handler = new Headers();
        handler.next(new MethodChainH())
                .next(new PathChainH())
                .next(new SessionChainH());

        handler.process(request);

        return request;
    }
}
