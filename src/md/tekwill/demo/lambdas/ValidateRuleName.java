package md.tekwill.demo.lambdas;

class ValidateRuleName implements ValidateRule {
    @Override
    public boolean check(Employee e) {
        return e.name.length() > 0;
    }
}
