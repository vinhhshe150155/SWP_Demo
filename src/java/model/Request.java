/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Request {
private int requestID;
private int userID;
private int subjectID;
private int moneyPerSlot;
private int timePerSlot;
private String startTime;
private String endTime;
private String description;
private int status;
/*1 is off, 2 is onl*/
private int learnType;
private int userType;
private String reqTime;
private List<RequestSlotTime> listSlotTime;
}
