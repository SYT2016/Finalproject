/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raunak
 */
public class WorkQueue {

    private final ArrayList<WorkRequest> workRequestList = new ArrayList<>();
    private List<WorkRequest> workRequestBSToPBList = new ArrayList<>();
    private List<WorkRequest> workRequestCusToSHBSList = new ArrayList<>();

    public WorkQueue() {
    }

    public List<WorkRequest> getWorkRequestCusToSHBSList() {
        if (workRequestCusToSHBSList == null) {
            workRequestCusToSHBSList = new ArrayList<>();
        }
        return workRequestCusToSHBSList;
    }

    public void addNewRequest(WorkRequest wr) {
        workRequestList.add(wr);
    }

    public void addNewBSToPublisherRequest(WorkRequest wr) {
        if (workRequestBSToPBList == null) {
            workRequestBSToPBList = new ArrayList<>();
        }
        workRequestBSToPBList.add(wr);
    }

    public void addNewCusToSHBSRequest(WorkRequest wr) {
        if (workRequestCusToSHBSList == null) {
            workRequestCusToSHBSList = new ArrayList<>();
        }
        workRequestCusToSHBSList.add(wr);
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        if (workRequestBSToPBList == null) {
            workRequestBSToPBList = new ArrayList<>();
        }
        return workRequestList;
    }

    public List<WorkRequest> getWorkRequestBSToPBList() {
        if (workRequestBSToPBList == null) {
            workRequestBSToPBList = new ArrayList<>();
        }
        return workRequestBSToPBList;
    }
}