package pl.edu.pb.mobilki1;

public class Question {

    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer){
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }

    public boolean isTrueAnswer(Question question) { return question.trueAnswer; }

    public int getQuestionId(Question question) { return question.questionId; }

}
