// ステップ2: 既存（きぞん）の Adapter クラス
public class MarkdownConverter {
    public String convertToHtml(String markdown) {
        return "<html><body>" + markdown.replace("**", "<b>").replace("*", "<i>") + "</body></html>";
    }
}
