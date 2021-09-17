/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class CourseSlot {
    private int slotID;
    private String slotTimeFrom;
    private String  slotTimeTo;
    private int courseID;

    public int getSlotID() {
        return slotID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public String getSlotTimeFrom() {
        return slotTimeFrom;
    }

    public void setSlotTimeFrom(String slotTimeFrom) {
        this.slotTimeFrom = slotTimeFrom;
    }

    public String getSlotTimeTo() {
        return slotTimeTo;
    }

    public void setSlotTimeTo(String slotTimeTo) {
        this.slotTimeTo = slotTimeTo;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public CourseSlot(int slotID, String slotTimeFrom, String slotTimeTo, int courseID) {
        this.slotID = slotID;
        this.slotTimeFrom = slotTimeFrom;
        this.slotTimeTo = slotTimeTo;
        this.courseID = courseID;
    }
}
