package com.topdesk.cases.toprob.yoursolution;

import java.util.List;

import com.topdesk.cases.toprob.Grid;
import com.topdesk.cases.toprob.Instruction;
import com.topdesk.cases.toprob.Solution;
import com.topdesk.cases.toprob.Coordinate;
import java.util.ArrayList;
import java.util.Set;

public class YourSolution implements Solution {

    Rob rob = new Rob();
    private static final int MAXTIME = 100;
    private static Grid GRID;
    private static int TIME;
    private Coordinate KITCHEN = null;
    private Coordinate ROOM = null;
    private int HEIGHT;
    private int WIDTH;
    List<Instruction> allInstruction = new ArrayList();

    public YourSolution() {}    

    @Override
    public List<Instruction> solve(Grid grid, int time) {
        setGrid(grid);
        setTime(time);
        allInstruction.clear();
        setKitchen(grid.getKitchen());
        setRoom(grid.getRoom());
        setHeight(grid.getHeight());
        setWidth(grid.getWidth());
        rob.setRobLocation(ROOM);

        if (!rob.getRobLocation().equals(KITCHEN)) {
            startJourney(KITCHEN);
        }
        if (rob.getRobLocation().equals(KITCHEN)) {
            startJourney(ROOM);
        }
        
        if(allInstruction == null){
            throw new UnsupportedOperationException("Nothing implemented yet");
        }
        else{
            return allInstruction;
        }
    }
    
    private void startJourney(Coordinate goThere) {
        Coordinate target = goThere;
        
        while (!rob.getRobLocation().equals(target) && TIME < MAXTIME) {            
            if (rob.getRobLocation().getX() < target.getX()) {
                if (isSafe(Instruction.EAST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.EAST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.EAST);
                    TIME++;
                }
                else if (thereIsBug(Instruction.EAST.execute(rob.getRobLocation()))){
                    rob.setRobLocation(Instruction.PAUSE.execute(rob.getRobLocation()));
                    pause();
                }
                else if (isSafe(Instruction.SOUTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.SOUTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.SOUTH);
                    TIME++;
                }                
                else if (isSafe(Instruction.NORTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.NORTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.NORTH);
                    TIME++;
                }
            }else if (rob.getRobLocation().getY() < target.getY()) {
                if (isSafe(Instruction.SOUTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.SOUTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.SOUTH);
                    TIME++;   
                }
                else if (thereIsBug(Instruction.SOUTH.execute(rob.getRobLocation()))){
                    rob.setRobLocation(Instruction.PAUSE.execute(rob.getRobLocation()));
                    pause();
                }
                else if (isSafe(Instruction.EAST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.EAST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.EAST);
                    TIME++;
                }
                else if (isSafe(Instruction.WEST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.WEST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.WEST);
                    TIME++;
                }
            } else if (rob.getRobLocation().getY() > target.getY()) {
                if (isSafe(Instruction.NORTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.NORTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.NORTH);
                    TIME++;
                }
                else if (thereIsBug(Instruction.NORTH.execute(rob.getRobLocation()))){
                    rob.setRobLocation(Instruction.PAUSE.execute(rob.getRobLocation()));
                    pause();
                }
                else if (isSafe(Instruction.WEST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.WEST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.WEST);
                    TIME++;
                }
                else if (isSafe(Instruction.EAST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.EAST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.EAST);
                    TIME++;
                }
            } else if (rob.getRobLocation().getX() > target.getX()) {
                if (isSafe(Instruction.WEST.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.WEST.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.WEST);
                    TIME++;
                }
                else if (thereIsBug(Instruction.WEST.execute(rob.getRobLocation()))){
                    rob.setRobLocation(Instruction.PAUSE.execute(rob.getRobLocation()));
                    pause();
                }
                else if (isSafe(Instruction.NORTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.NORTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.NORTH);
                    TIME++;
                }
                else if (isSafe(Instruction.SOUTH.execute(rob.getRobLocation()))) {
                    rob.setRobLocation(Instruction.SOUTH.execute(rob.getRobLocation()));
                    allInstruction.add(Instruction.SOUTH);
                    TIME++;
                }
            } 
            else {
                    rob.setRobLocation(Instruction.PAUSE.execute(rob.getRobLocation()));
                    pause();
                }
            if (rob.getRobLocation().equals(KITCHEN)) {
                makeSandwich();
            }    
        }
    }

    private boolean isSafe(Coordinate c) {
        Coordinate robotRobMove = c;
        
        if(fallFromGrid(robotRobMove)){
            if (!thereIsHole(robotRobMove)){
                if(!thereIsBug(robotRobMove)){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }            
        }
        else {
            return false;
        }
    }
    
    private boolean fallFromGrid(Coordinate c)
    {
        if(c.getX() >= 0 && c.getX() <= WIDTH)
        {
            if(c.getY() >= 0 && c.getY() <= HEIGHT)
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    private boolean thereIsBug(Coordinate c)
    {
        if(c.equals(GRID.getBug(TIME+1)))
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean thereIsHole(Coordinate c)
    {
        if(GRID.getHoles().contains(c))
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    private void makeSandwich() {
        for(int i = 0; i < 5; i++)
        {
            pause();
        }
    }

    private void pause() {
        allInstruction.add(Instruction.PAUSE);
        TIME++;
    }
    
    private void setGrid(Grid grid) {
        if (grid == null) {
            throw new NullPointerException("no grid found!");
        } else {
            GRID = grid;
        }
    }

    private void setTime(int time) {
        if (time < 0) {
            throw new IllegalArgumentException("number is negative");
        } else {
            TIME = time;
        }
    }

    public int getTime() {
        return TIME;
    }
    
    private void setKitchen(Coordinate c)
    {
        if(c == null){
        throw new NullPointerException("no kitchen found!");            
        }
        else{
        KITCHEN = c;
        }
    }
    private void setRoom(Coordinate c)
    {
        if(c == null){
        throw new NullPointerException("no kitchen found!");            
        }
        else{
        ROOM = c;
        }
    }
    private void setHeight(int x)
    {
        if (x <= 0) {
            throw new IllegalArgumentException("number is negative or zero");
        } else {
        HEIGHT = x;
        }
    }
    private void setWidth(int x)
    {
        if (x <= 0) {
            throw new IllegalArgumentException("number is negative or zero");
        } else {
        WIDTH = x;
        }
    }
}