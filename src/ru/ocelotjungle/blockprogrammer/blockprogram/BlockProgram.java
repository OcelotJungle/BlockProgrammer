package ru.ocelotjungle.blockprogrammer.blockprogram;

import org.bukkit.Location;

import ru.ocelotjungle.blockprogrammer.actions.ActionManager.ActionType;

public class BlockProgram {
	
	private Location location;
	private String commandExecution, cycledFormChanging, randomFormChanging, randomFormChangingWithRepeats;
	private Boolean deleteProgram;
	
	public BlockProgram(Location location) {
		this(location, null, null, null, null, false);
	}
	
	public BlockProgram(Location location, String commandExecution, String cycledFormChanging, String randomFormChanging, String randomFormChangingWithRepeats, Boolean deleteProgram) {
		this.location = location;
		setActionValue(ActionType.commandExecution, commandExecution);
		setActionValue(ActionType.cycledFormChanging, cycledFormChanging);
		setActionValue(ActionType.randomFormChanging, randomFormChanging);
		setActionValue(ActionType.randomFormChangingWithRepeats, randomFormChangingWithRepeats);
		setActionValue(ActionType.deleteProgram, deleteProgram);
	}
	
	public Object getActionValue(ActionType actionType) {
		switch(actionType) {
			case commandExecution: return commandExecution;
			case cycledFormChanging: return cycledFormChanging;
			case randomFormChanging: return randomFormChanging;
			case randomFormChangingWithRepeats: return randomFormChangingWithRepeats;
			case deleteProgram: return deleteProgram;
			default: return null;
		}
	}
	
	public void setActionValue(ActionType actionType, Object value) {
		switch(actionType) {
			case commandExecution:
				commandExecution = (String)value;
				break;
			case cycledFormChanging:
				cycledFormChanging = (String)value;
				break;
			case randomFormChanging:
				randomFormChanging = (String)value;
				break;
			case randomFormChangingWithRepeats:
				randomFormChangingWithRepeats = (String)value;
				break;
			case deleteProgram:
				deleteProgram = (Boolean)value;
				break;
		}
	}
	
	public Location getLocation() {
		return location;
	}
}
