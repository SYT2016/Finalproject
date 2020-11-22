/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author 16104
 */
//印刷部，负责处理印刷任务。印刷工人有个status，表示正在工作or没有工作，
//如果该工人正在工作，那么其他的印刷任务不能分配给这个人
public class PT_PrintingOrganization extends Organization{
    public PT_PrintingOrganization(){
        super("PT_PrintingOrganization","PT");//设置部门类别
    }
    
}
