package part03.controller;

import java.util.List;

import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class MenuMain {

	public static void main(String[] args) {
		
		EmpDeptController eDeptController = new EmpDeptController();
//		List<EmpDTO> aList = eDeptController.empdeptProcess();
//		for(EmpDTO eDto : aList) {
//			System.out.printf("%d \t%-10s \t%-10s \t%d \t%s\n", eDto.getEmployee_id(), eDto.getFirst_name(),
//					eDto.getJob_id(), eDto.getDept().getDepartment_id(), eDto.getDept().getDepartment_name());
//		}
		
//		List<DeptDTO> dList = eDeptController.deptempProcess();
//		for(DeptDTO dDto : dList) {
//			
//			for(EmpDTO eDto : dDto.getEmpList()) {
//				System.out.printf("%d \t%-15s \t%-10d \t%-10s \t%s\n", dDto.getDepartment_id(), dDto.getDepartment_name(),
//						eDto.getEmployee_id(), eDto.getFirst_name(), eDto.getJob_id());				
//			}
//
//		}
		
//		List<EmpDTO> aList = eDeptController.partProcess();
//		for(EmpDTO dto : aList) {
//			System.out.printf("%d %s %s %d \n", dto.getEmployee_id(), dto.getFirst_name(),
//					dto.getJob_id(), dto.getDepartment_id());
//		}
		
		List<EmpDTO> aList = eDeptController.chainProcess();
		for(EmpDTO dto : aList) {
			System.out.printf("%d \t%-10s \t%-20s \t%s\n", dto.getEmployee_id(), dto.getFirst_name(),
					dto.getDept().getDepartment_name(), dto.getLoc().getCity());
		}
	}//end main()
	
}//end class
