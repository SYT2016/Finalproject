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
    
    public void addNewRequest(WorkRequest wr){
        workRequestList.add(wr);
    }
    
    public void addNewBSToPublisherRequest(WorkRequest wr){
        workRequestBSToPBList.add(wr);
    }
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}