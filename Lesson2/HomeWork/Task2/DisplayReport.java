public class DisplayReport implements ReportActions {

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output on display");
        for(ReportItem item : items){
            System.out.format("display %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
