package net.omniscimus.bukkit.democracy;

import org.bukkit.command.CommandSender;

import net.omniscimus.bukkit.democracy.exceptions.NoPermissionException;
import net.omniscimus.bukkit.democracy.exceptions.WrongArgumentsNumberException;
import net.omniscimus.bukkit.democracy.exceptions.WrongSenderTypeException;
import net.omniscimus.bukkit.democracy.exceptions.WrongSyntaxException;

/**
 * Represents a user command for this plugin.
 */
public abstract class PluginCommand {

    protected CommandSender sender;
    protected String[] args;

    /**
     * Creates a new PluginCommand instance.
     * 
     * @param sender
     *            The instance which sent this command.
     * @param args
     *            The command arguments.
     */
    public PluginCommand(CommandSender sender, String[] args) {
        this.sender = sender;
        this.args = args;
    }

    /**
     * Executes this command.
     * 
     * @throws WrongArgumentsNumberException
     *             If the sender used too many or too few arguments.
     * @throws WrongSenderTypeException
     *             If the sender is of an appropriate type, e.g. it is a console
     *             while it should have been a player.
     * @throws WrongSyntaxException
     *             If the command syntax is incorrect.
     * @throws NoPermissionException
     *             If the sender does not have permission to execute this
     *             command.
     */
    public abstract void run()
            throws WrongArgumentsNumberException, WrongSenderTypeException, WrongSyntaxException, NoPermissionException;

}