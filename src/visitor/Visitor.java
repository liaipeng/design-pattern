package visitor;

/**
 * 具体访问者
 * 
 * @author lap
 * 
 */
public class Visitor implements IVisitor {
	// 部门经理的工资系数是5
	private final static int MANAGER_COEFFICIENT = 5;
	// 员工的工资系数是2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	// 普通员工的工资总和
	private int commonTotalSalary = 0;
	// 部门经理的工资总和
	private int managerTotalSalary = 0;

	// 计算部门经理的工资总和
	private void calManagerSalary(int salary) {
		this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
	}

	// 计算普通员工的工资总和
	private void calCommonSlary(int salary) {
		this.commonTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
	}

	// 获得所有员工的工资总和
	public int getTotalSalary() {
		return this.commonTotalSalary + this.managerTotalSalary;
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		calCommonSlary(commonEmployee.getSalary());
	}

	@Override
	public void visit(Manager manager) {
		calManagerSalary(manager.getSalary());
	}
}