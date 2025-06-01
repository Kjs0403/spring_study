package hello.hello_spring.controller;

public class MemberForm {

    private String name;

    public String getName() {
        return name;
    }

    //spring이 자동 호출
    public void setName(String name) {
        this.name = name;
    }

}
