// ステップ3: アダプタークラス
public class FormatAdapter implements TextEditor {
    private MarkdownConverter markdownConverter;

    public FormatAdapter(String format) {
        if (format.equalsIgnoreCase("markdown")) {
            markdownConverter = new MarkdownConverter();
        }
    }

    @Override
    public void display(String format, String content) {
        if (format.equalsIgnoreCase("markdown")) {
            System.out.println("Converted HTML:\n" + markdownConverter.convertToHtml(content));
        } else if (format.equalsIgnoreCase("plaintext")) {
            System.out.println("PlainText:\n" + content);
        } else {
            System.out.println("Unsupported format: " + format);
        }
    }
}
