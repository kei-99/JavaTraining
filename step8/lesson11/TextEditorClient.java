// ステップ4: クライアントクラス
public class TextEditorClient implements TextEditor {
    private FormatAdapter formatAdapter;

    @Override
    public void display(String format, String content) {
        if (format.equalsIgnoreCase("markdown") || format.equalsIgnoreCase("plaintext")) {
            formatAdapter = new FormatAdapter(format);
            formatAdapter.display(format, content);
        } else {
            System.out.println("Invalid format: " + format);
        }
    }
}
