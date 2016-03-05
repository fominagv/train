package Lesson_02.HomeWork;

public class HW_DataTypes2 {

    public static void main(String[] args) {
    // TODO Раскоментируйте и исправте ошибки компиляции
        int a = 5;
        int b = 6;
       // ++a = b++;
      // char c1=('K' + 1)/2.;  // Тип должен остаться char
      //  float m2=.0;  //Тип должен остаться float
      //  float flo = (1.== 1) ? 3. : 6;  //Тип должен остаться float

        // TODO Что будет напечатано?
        char c=('K' + 1)/2;
        System.out.println(c);

        double m1=2.;
        System.out.println(m1==m1++);

        float m2=.0f;
        System.out.println(m2++==++m2);

        double m3=1.5;
        System.out.println(++m3==++m3);

        float m4=0.3f;
        System.out.println(m4++==m4++);

        double m5=1.;
        System.out.println(++m5==m5);

        int k=5;
        float fl =   true ? k : -k;
        System.out.println(fl);

        System.out.println(k==5 | (Float.isInfinite(1f/0f)));
        System.out.println(k==5 || (Float.isInfinite(1f/0f)));
        System.out.println(k!=5 & (Float.isInfinite(1/0)));
        System.out.println(k!=5 && (Float.isInfinite(1f/0)));

        //TODO Создать класс Box с полями (length, width, height, weight) с конструктором инициализирующим все поля и методами get, set для каждого поля

    }
}
