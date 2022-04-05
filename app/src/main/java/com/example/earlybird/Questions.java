package com.example.earlybird;

public class Questions {

    private String mQuestions[]={
            "That horse looks a bit cold. Which film is this scene from?",
            "Which movie had a time-traveling car?",
            "Where is this tower that might never fall down?",
            "This is the smallest country in the world. What is its name?",
            " What is this food?",
            "what is the name of the show?",
            "who was the 44th president of U.S?",
            "What is the name of the Scientist ?",
            "What is the name of the band",
            "What's the name of the person in the picture",
            "This is the flag of which country",
            "What's the name of the character in the picture ?"

    };
    //אפשרויות
    private String mChoice[] []={
            {"Star wars", "Frozen", "Ice queen"},//Frozen
            {"Back to the future", "The time machine", "The final coutndown"},//Back to the future
            {"Pisa", "Rome", "Milan"},//Pisa
            {"Hong kong", "Monaco", "Vatican city"},//Vatican city
            {"Avacado", "Pear", "Tomato"},//Avacado
            {"Big bang Theory", "Friends", "Modern Family"},//Big bang theory
            {"Barack obama", "Donald Trump", "Joe Biden"},//Barack obama
            {"Charles Darwin", "Albert Einstein", "Isaac Newton"},//Albert Einstein
            {"EXO", "BTS", "One Direction"},// One Direction
            {"Steve Jobs", "Bill Gates", "Jeff Bezos"},// Bill Gates
            {"South Korea", "Japan", "Russia"},//South Korea
                {"Larry ", "Harry potter", "Ron"}//Harry potter

    };
    //תמונה
    private String mImages[]={
            "q",
            "q1",
            "q2",
            "q3",
            "q4",
            "q5",
            "q6",
            "q7",
            "q8",
            "q9",
            "q10",
            "q11"

    };
    //סוג
    private String mQuestionsType[]={
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton"
    };
    //תשובה
    private String mCorrectAnswers[]={
            "Frozen",
            "Back to the future",
            "Pisa",
            "Vatican city",
            "Avacado",
            "Big bang Theory",
            "Barack obama",
            "Albert Einstein",
            "One Direction",
            "Bill Gates",
            "South Korea",
            "Harry potter"
    };
    //יצירת Get
    public String getQuestions(int q) {
        String questions =mQuestions[q];
        return questions;
    }

    public String[] getChoice(int q) {
        String[] Choice = mChoice[q];
        return Choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q){
        String type= mQuestionsType[q];
        return type;
    }
    public int getLength(){
        return mQuestions.length;
    }
    public String getCorrectAnswers(int q){
        String correct= mCorrectAnswers [q];
        return correct;
    }
}
