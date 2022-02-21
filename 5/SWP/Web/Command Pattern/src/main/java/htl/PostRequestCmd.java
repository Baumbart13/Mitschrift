package htl;

public class PostRequestCmd implements Command {
    WebRequest obj;
    String url;
    String params;

    public PostRequestCmd(WebRequest obj, String url, String params) {
        super();
        this.obj = obj;
        this.url = url;
        this.params = params;
    }

    @Override
    public void execute() {
        obj.postRequest(url, params);
    }
}
