package edu.cftic.fichapp.persistencia.interfaces;


import java.util.List;

import edu.cftic.fichapp.bean.Empresa;

public interface IEmpresaDao {
    public Empresa getEmpresaId(int id_empresa);
    public List<Empresa> getEmpresas();
    public Empresa primero();
    public Empresa ultimo();
    public boolean nuevo(Empresa e);
    public boolean eliminar(int id_empresa);
    public boolean actualizar(Empresa e);
}
