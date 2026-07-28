

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Loans

{
	// ---( internal utility methods )---

	final static Loans _instance = new Loans();

	static Loans _newInstance() { return new Loans(); }

	static Loans _cast(Object o) { return (Loans)o; }

	// ---( server methods )---




	public static final void raiseToPower (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(raiseToPower)>> ---
		// @sigtype java 3.5
		// [i] field:0:required base
		// [i] field:0:required exponent
		// [o] field:0:required value
		IDataCursor pipelineCursor = pipeline.getCursor();
		String base = IDataUtil.getString( pipelineCursor, "base" );
		String exponent = IDataUtil.getString( pipelineCursor, "exponent" );
		pipelineCursor.destroy();
		
		Double value = Math.pow(Double.parseDouble(base), Double.parseDouble(exponent));
		
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", Double.toString(value) );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

