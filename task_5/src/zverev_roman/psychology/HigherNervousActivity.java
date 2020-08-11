package zverev_roman.psychology;

public abstract class HigherNervousActivity {

    String improvement;

    public HigherNervousActivity() {
    }

    public String getImprovement() {
        return improvement;
    }

    public void setImprovement(String improvement) {
        if(improvement.equals("эмпирический") || improvement.equals("теоретический")){
            this.improvement = improvement;
        }else{
            System.out.println("Некорректный тип! Укажите эмпирический или теоретический");
        }
    }
}
