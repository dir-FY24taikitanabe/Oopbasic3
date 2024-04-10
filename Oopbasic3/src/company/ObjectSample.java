package company;

public class ObjectSample {

    public static void main(String[] args) {
        // オブジェクトの作成,クラスという型に入れる中身、オブジェクト鈴木
       
        var employee = new Employee("鈴木", "営業部", "課長", 100);

        // オブジェクトメソッドの呼び出し
        employee.report();
        employee.report(2);
        
        System.out.println("");
        
        var engineer = new Employee("田中", "開発部", "ヒラ",88);
        
        engineer.report();
    }

}