package md.tekwill.demo.inheritance.employeehomework;

import java.time.LocalDate;

class SuperProductionWorker extends ProductionWorker {
    private String nickname;

    public SuperProductionWorker(String name, String nickname, LocalDate hireDate, int shift, int hourlyPayRate) {
        super(name, hireDate, shift, hourlyPayRate);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "SuperProductionWorker{" +
                "nickname='" + nickname + '\'' +
                ", shift=" + shift +
                ", hourlyPayRate=" + hourlyPayRate +
                ", name='" + name + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
