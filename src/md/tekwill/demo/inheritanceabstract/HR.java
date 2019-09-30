package md.tekwill.demo.inheritanceabstract;

class HR {
    public void sendInvitation(Employee e){
        System.out.println("Invitation sent to " + e.getName() + " at " + e.getAddress());
    }
}
