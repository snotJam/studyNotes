package tools.copy;

public class Client {
    public static void main(String[] args) {

        String pathPre = "E:\\AndroiwWorkspace\\homehealth_doctor\\app\\src\\main\\java\\com\\ehome9\\activity\\";
//        String fragPathPre = "E:\\AndroiwWorkspace\\homehealth_doctor\\app\\src\\main\\java\\com\\ehome9\\fragment\\";
//        String adapterPathPre = "E:\\AndroiwWorkspace\\homehealth_doctor\\app\\src\\main\\java\\com\\ehome9\\adapter\\";
//        String utilPathPre = "E:\\AndroiwWorkspace\\homehealth_doctor\\app\\src\\main\\java\\com\\ehome9\\util\\";

        String pathEnd = ".java";

        String[] sourceNames = {pathPre + "AddFollowActivity" + pathEnd,
                pathPre + "AuxiliaryExaminationActivity" + pathEnd,
                pathPre + "BaseEventBusActivity" + pathEnd,
                pathPre + "BasicContentActivity" + pathEnd,
                pathPre + "ChangeTimeActivity" + pathEnd,
                pathPre + "ChatBaseActivity" + pathEnd,
                pathPre + "ChatContinueActivity" + pathEnd,
                pathPre + "ChatFinishActivity" + pathEnd,
                pathPre + "ChoiceAreaActivity" + pathEnd,
                pathPre + "ClientDetailActivity" + pathEnd,
                pathPre + "DiagnoseActivity" + pathEnd,
                pathPre + "DrugSearchActivity" + pathEnd,
                pathPre + "DutyActivity" + pathEnd,
                pathPre + "EMRActivity" + pathEnd,
                pathPre + "FeedbackActivity" + pathEnd,
                pathPre + "HealthDataActivity" + pathEnd,
                pathPre + "HomeMessageDetailActivity" + pathEnd,
                pathPre + "InformSettingActivity" + pathEnd,
                pathPre + "InterviewInformationActivity" + pathEnd,
                pathPre + "InterviewRecordActivity" + pathEnd,
                pathPre + "InterviewRecordRootActivity" + pathEnd,
                pathPre + "LifestyleGuidanceActivity" + pathEnd,
                pathPre + "MedicationSituationActivity" + pathEnd,
                pathPre + "MyCollectionActivity" + pathEnd,
                pathPre + "MyQrCodeActivity" + pathEnd,
                pathPre + "MyTeamActivity" + pathEnd};
        CopyTools.copy(sourceNames, "C:\\Users\\sno\\Desktop\\target.txt");
        System.out.println("finish");
    }
}
