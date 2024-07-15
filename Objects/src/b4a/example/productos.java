package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class productos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.productos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.productos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.productos __ref,anywheresoftware.b4a.BA _ba,String _nombrebdd) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_nombrebdd}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize( nombreBdd As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="sql.Initialize( File.DirInternal, nombreBdd, True";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .Initialize(__c.File.getDirInternal(),_nombrebdd,__c.True);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS prod";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS productos( id INT PRIMARY KEY, nombreProducto TEXT(50), precioUnitario NUMBER(10,3), iva NUMBER(5,3), stock NUMBER(10,3) )");
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public boolean  _delete(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((Boolean) Debug.delegate(ba, "delete", new Object[] {_id}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Delete(id As Int) As Boolean";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM productos WHERE id";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DELETE FROM productos WHERE id = "+BA.NumberToString(_id));
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="End Sub";
return false;
}
public b4a.example.producto  _create(b4a.example.productos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "create", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
b4a.example.producto _p = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub Create( id As Int, nombreProducto As St";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO productos( id, nom";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO productos( id, nombreProducto, precioUnitario, iva, stock ) VALUES ( ?, ?, ?, ?, ? )",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id),(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock)}));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="p.Id = id";
_p._id /*int*/  = _id;
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="p.NombreProducto = nombreProducto";
_p._nombreproducto /*String*/  = _nombreproducto;
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="p.PrecioUnitario = precioUnitario";
_p._preciounitario /*double*/  = _preciounitario;
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="p.IVA = iva";
_p._iva /*double*/  = _iva;
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="p.Stock = stock";
_p._stock /*double*/  = _stock;
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="End Sub";
return null;
}
public b4a.example.producto  _read_byid(b4a.example.productos __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((b4a.example.producto) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
b4a.example.producto _p = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Read_ById( id As Int) As Producto";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProducto";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos WHERE id = "+BA.NumberToString(_id))));
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="cursor.Position = 0";
_cursor.setPosition((int) (0));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
 };
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="End Sub";
return null;
}
public boolean  _update(b4a.example.productos __ref,int _id,String _nombreproducto,double _preciounitario,double _iva,double _stock) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((Boolean) Debug.delegate(ba, "update", new Object[] {_id,_nombreproducto,_preciounitario,_iva,_stock}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub Update(id As Int, nombreProducto As Str";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="sql.ExecNonQuery2(\"UPDATE productos SET nombrePro";
__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("UPDATE productos SET nombreProducto = ?, precioUnitario = ?, iva = ?, stock = ? WHERE id = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nombreproducto),(Object)(_preciounitario),(Object)(_iva),(Object)(_stock),(Object)(_id)}));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _read_all(b4a.example.productos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="productos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "read_all", null));}
anywheresoftware.b4a.objects.collections.List _resultado = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
b4a.example.producto _p = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Read_All () As List";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim resultado As List";
_resultado = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="resultado.Initialize";
_resultado.Initialize();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="cursor = sql.ExecQuery(\"SELECT id, nombreProduct";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT id, nombreProducto, precioUnitario, iva, stock FROM productos ORDER BY nombreProducto")));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="For i=0 To cursor.RowCount-1";
{
final int step5 = 1;
final int limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Dim p As Producto";
_p = new b4a.example.producto();
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="p.Initialize";
_p._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="p.Id = cursor.GetInt(\"id\")";
_p._id /*int*/  = _cursor.GetInt("id");
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="p.NombreProducto = cursor.GetString(\"nombreProdu";
_p._nombreproducto /*String*/  = _cursor.GetString("nombreProducto");
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="p.PrecioUnitario = cursor.GetDouble(\"precioUnita";
_p._preciounitario /*double*/  = _cursor.GetDouble("precioUnitario");
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="p.IVA = cursor.GetDouble(\"iva\")";
_p._iva /*double*/  = _cursor.GetDouble("iva");
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="p.Stock = cursor.GetDouble(\"stock\")";
_p._stock /*double*/  = _cursor.GetDouble("stock");
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="resultado.Add(p)";
_resultado.Add((Object)(_p));
 }
};
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Return resultado";
if (true) return _resultado;
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="End Sub";
return null;
}
}