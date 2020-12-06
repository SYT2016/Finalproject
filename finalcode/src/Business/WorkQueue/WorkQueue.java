/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequest> workRequestBSToPBList;
    private ArrayList<WorkRequest> workRequestCusToSHBSList;

    public ArrayList<WorkRequest> getWorkRequestCusToSHBSList() {
        return workRequestCusToSHBSList;
    }

    public void setWorkRequestCusToSHBSList(ArrayList<WorkRequest> workRequestCusToSHBSList) {
        this.workRequestCusToSHBSList = workRequestCusToSHBSList;
    }
    
    
    public void addNewRequest(WorkRequest wr){
        workRequestList.add(wr);
    }
    
    public void addNewBSToPublisherRequest(WorkRequest wr){
        workRequestBSToPBList.add(wr);
    }
    
    public void addNewCusToSHBSRequest(WorkRequest wr){
        workRequestList.add(wr);
    }
    
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestBSToPBList() {
        return workRequestBSToPBList;
    }

    public void setWorkRequestBSToPBList(ArrayList<WorkRequest> workRequestBSToPBList) {
        this.workRequestBSToPBList = workRequestBSToPBList;
    }
    
    
    
}