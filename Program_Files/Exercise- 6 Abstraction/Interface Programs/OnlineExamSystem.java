interface Exam {
    void startExam();
}

class MCQExam implements Exam {
    public void startExam() {
        System.out.println("Starting Multiple Choice Questions exam...");
    }
}

class CodingExam implements Exam {
    public void startExam() {
        System.out.println("Starting Coding Exam...");
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Exam mcq = new MCQExam();
        Exam coding = new CodingExam();

        mcq.startExam();
        coding.startExam();
    }
}
