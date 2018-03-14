/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    private String name;
    private String manager;

    /**
     * Constructor for initialization.
     * @param name
     * @param manager
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
    /**
     * Returns the manager for the given employee.
     * @param employee
     */
    public Employee findManager(final Employee employee) {
        return ;
    }
    /**
     * Returns the manager for the given employee.
     * @param employee
     */
    public int countManagersAbove(final Employee employee){
        Employee manager = findManager();
        if (manager == null) {
            return 0;
        } else {
            return 1 + countManagersAbove(manager);
        }

    }
    CEU(employee){
        int count = 0;
        for (int i = 0; i < employees.size; i++){
            if (findManager(employers.get(i)==employee)){
                count += 1 + CEU(employers.get(i));
            }
        }
        return count;
    }
}
