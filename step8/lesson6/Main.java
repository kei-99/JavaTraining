import java.util.ArrayList;
import java.util.List;

// FileSystemComponentインターフェース（共通きょうつうの操作そうさを定義ていぎ）
interface FileSystemComponent {
    void display(String indent); // 表示（ひょうじ）メソッド
}

// Fileクラス（葉は：Leaf）
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component); // 子要素（こようそ）を追加（ついか）
    }

    public void remove(FileSystemComponent component) {
        children.remove(component); // 子要素（こようそ）を削除（さくじょ）
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent child : children) {
            child.display(indent + "  "); // 再帰的（さいきてき）に表示（ひょうじ）
        }
    }
}

// Mainクラス（テストよう）
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.add(new File("file1.txt"));
        root.add(new File("file2.txt"));

        Directory subDir1 = new Directory("subDir1");
        subDir1.add(new File("file3.txt"));
        subDir1.add(new File("file4.txt"));
        root.add(subDir1);

        Directory subDir2 = new Directory("subDir2");
        subDir2.add(new File("file5.txt"));
        root.add(subDir2);

        root.display(""); // 構造（こうぞう）を表示（ひょうじ）
    }
}
