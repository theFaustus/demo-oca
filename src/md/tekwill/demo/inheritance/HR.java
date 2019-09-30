package md.tekwill.demo.inheritance;

class HR {
    public void sendInvitation(Employee e){
        System.out.println("Invitation sent to " + e.getName() + " at " + e.getAddress());
    }
}
