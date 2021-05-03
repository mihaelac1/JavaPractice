package JavaPracticeGitHub.C15_NestedClasses;

public class EclipseIDE {
    private String path;

    public EclipseIDE(String path) {
        this.path = path;
    }

    // class is package-private in order to analyze external use cases
    static class WorkspaceName {
        private String workspaceName;

        public WorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
        }

        public String getWorkspaceName() {
            return workspaceName;
        }
    }

    class FilePath {
        public String getFilePath(String fileName) {
            return EclipseIDE.this.path + "/" + fileName;
        }
    }
}

class Main{
    public static void main(String[] args) {
        EclipseIDE eclipse = new EclipseIDE("/Users/Devmind/Eclipse");

        // Remember inner non-static class initialization:
        EclipseIDE.FilePath filePath = eclipse.new FilePath();

        // Nested static class initialization:
        // OK - with class name
        EclipseIDE.WorkspaceName workspaceName = new EclipseIDE.WorkspaceName("JSD");

        // ERROR - with instance obj
//        EclipseIDE.WorkspaceName workspaceName2 = eclipse.new WorkspaceName("JSD");

        System.out.println(filePath.getFilePath("InnerClasses.java"));
        System.out.println(workspaceName.getWorkspaceName());
    }
}
