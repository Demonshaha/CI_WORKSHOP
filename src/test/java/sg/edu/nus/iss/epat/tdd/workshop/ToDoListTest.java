package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class ToDoListTest  {
    // Define Test Fixtures
    private ToDoList toDoList = new ToDoList();
    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask() {
        Task t1 = new Task("t1", false);
        toDoList.addTask(t1);
        assertTrue(toDoList.getTask("t1") != null);
    }

    @Test
    public void testGetStatus() {
        Task t1 = new Task("t1", true);
        Task t2 = new Task("t2", false);
        toDoList.addTask(t1);
        toDoList.addTask(t2);
        assertTrue(toDoList.getStatus("t1") == true);
        assertTrue(toDoList.getStatus("t2") == false);
    }

    @Test
    public void testRemoveTask() {
        Task t1 = new Task("t1", true);
        toDoList.addTask(t1);
        assertTrue(toDoList.getTask("t1") != null);
        toDoList.removeTask("t1");
        assertTrue(toDoList.getTask("t1") == null);
    }

    @Test
    public void testGetCompletedTasks() {
        Task t1 = new Task("t1", true);
        Task t2 = new Task("t2", false);
        toDoList.addTask(t1);
        toDoList.addTask(t2);
        Collection<Task> tasks = toDoList.getCompletedTasks();
        assertTrue(tasks.contains(t1));
        assertFalse(tasks.contains(t2));
    }
}