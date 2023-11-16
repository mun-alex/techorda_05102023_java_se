package core.abstraction;

public class NewProject {
    public static void main(String[] args) {
        MyITCompany company = new MyITCompany();
        ProjectManager pm = new ProjectManager("Raichan", 22);
        SystemAnalyst sa = new SystemAnalyst("Gulschat", 22);
        BackendDeveloper back = new BackendDeveloper("Baglan", 25);
        FrontendDeveloper front = new FrontendDeveloper("Yerassyl", 21);
        QualityAssurance qa = new QualityAssurance("Zhansaya", 18);
        ITEmployee[] team = {pm, sa, back, front, qa};

        for (int i = 0; i < team.length; i++) {
            company.createProduct(team[i]);
        }

        ITEmployee emp = new BackendDeveloper("fdf", 15);
    }
}
