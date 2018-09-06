/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourteam.cms.entityClass;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aruna
 */
@Entity
@Table(name = "role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")
    , @NamedQuery(name = "Role.findById", query = "SELECT r FROM Role r WHERE r.id = :id")
    , @NamedQuery(name = "Role.findByRoleName", query = "SELECT r FROM Role r WHERE r.roleName = :roleName")
    , @NamedQuery(name = "Role.findByRoleDes", query = "SELECT r FROM Role r WHERE r.roleDes = :roleDes")
    , @NamedQuery(name = "Role.findByRoleCreate", query = "SELECT r FROM Role r WHERE r.roleCreate = :roleCreate")
    , @NamedQuery(name = "Role.findByRoleDelete", query = "SELECT r FROM Role r WHERE r.roleDelete = :roleDelete")
    , @NamedQuery(name = "Role.findByRoleUpdate", query = "SELECT r FROM Role r WHERE r.roleUpdate = :roleUpdate")
    , @NamedQuery(name = "Role.findByRoleRead", query = "SELECT r FROM Role r WHERE r.roleRead = :roleRead")
    , @NamedQuery(name = "Role.findByCreateAt", query = "SELECT r FROM Role r WHERE r.createAt = :createAt")
    , @NamedQuery(name = "Role.findByUpdateAt", query = "SELECT r FROM Role r WHERE r.updateAt = :updateAt")})
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "role_name")
    private String roleName;
    @Basic(optional = false)
    @Column(name = "role_des")
    private String roleDes;
    @Basic(optional = false)
    @Column(name = "role_create")
    private boolean roleCreate;
    @Basic(optional = false)
    @Column(name = "role_delete")
    private boolean roleDelete;
    @Basic(optional = false)
    @Column(name = "role_update")
    private boolean roleUpdate;
    @Basic(optional = false)
    @Column(name = "role_read")
    private boolean roleRead;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
    @Basic(optional = false)
    @Column(name = "update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @OneToMany(mappedBy = "roleId")
    private Collection<Users> usersCollection;

    public Role() {
    }

    public Role(Integer id) {
        this.id = id;
    }

    public Role(Integer id, String roleName, String roleDes, boolean roleCreate, boolean roleDelete, boolean roleUpdate, boolean roleRead, Date updateAt) {
        this.id = id;
        this.roleName = roleName;
        this.roleDes = roleDes;
        this.roleCreate = roleCreate;
        this.roleDelete = roleDelete;
        this.roleUpdate = roleUpdate;
        this.roleRead = roleRead;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDes() {
        return roleDes;
    }

    public void setRoleDes(String roleDes) {
        this.roleDes = roleDes;
    }

    public boolean getRoleCreate() {
        return roleCreate;
    }

    public void setRoleCreate(boolean roleCreate) {
        this.roleCreate = roleCreate;
    }

    public boolean getRoleDelete() {
        return roleDelete;
    }

    public void setRoleDelete(boolean roleDelete) {
        this.roleDelete = roleDelete;
    }

    public boolean getRoleUpdate() {
        return roleUpdate;
    }

    public void setRoleUpdate(boolean roleUpdate) {
        this.roleUpdate = roleUpdate;
    }

    public boolean getRoleRead() {
        return roleRead;
    }

    public void setRoleRead(boolean roleRead) {
        this.roleRead = roleRead;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourteam.cms.entityClass.Role[ id=" + id + " ]";
    }
    
}
