package udemy_tutorial;

import jdk.swing.interop.SwingInterOpUtils;

public class tsett5 {
    public static void main(String[] args) {
//        Course semFirst = new Course("Tony");//???
//        semFirst.setCode("no param");
//        semFirst.setName("Tony");
//        Course semFirst = new Course("with param", "Tony");
//        semFirst.getCode()

//        System.out.println(semFirst.getName());
//        System.out.println(semFirst.getCode());
//
//
//        OrgUnit Vietnam = new OrgUnit("12", "Vietnam", null);
//        OrgUnit HCMC = new OrgUnit("1", "HCMC", Vietnam);
//        OrgUnit district1 = new OrgUnit("3", "D1", HCMC);
//
//        System.out.println(district1.getParents().getParents().getName());

        Course semFirst = new Course("1234","Tony","1111");
        System.out.println(semFirst.getName());
        System.out.println(semFirst.getCode());
        System.out.println(semFirst.getNumber());

        OrgUnit Vn = new OrgUnit("1","Vietnam",null);
        OrgUnit Hcm = new OrgUnit("2","HCMC",Vn);
        OrgUnit D7 = new OrgUnit("3","The park residence",Hcm);


        System.out.println(D7.getParents().getParents().getParents());





    }
}
