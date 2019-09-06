package md.tekwill.demo.swap;

class PersonWrapper {
    Person person;

    PersonWrapper(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
