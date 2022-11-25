https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/**
 * The <code>RoutingPacket</code> constructor. This is a subclass of the packet
 * super class and mearly sets the packet type to ROUTING.
 */ 
public class RoutingPacket extends Packet
{
    /**
     * <code>RoutingPacket</code> constructor. Calls the super class and 
     * sets the type to ROUTING.
     */
    RoutingPacket(int src, int dst)
	{
	    super(src,dst);
	    type = Packet.ROUTING;
	}
}
