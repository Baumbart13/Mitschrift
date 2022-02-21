package htl;

public class GetRequestCmd implements Command {
    WebRequest obj;
    String url;

    public GetRequestCmd(WebRequest obj, String url){
        super();
        this.obj = obj;
        this.url = url;
    }

    @Override
    public void execute() {
        obj.getRequest(url);
    }
}
