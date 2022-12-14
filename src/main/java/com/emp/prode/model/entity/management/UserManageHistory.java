package com.emp.prode.model.entity.management;

import com.emp.prode.model.entity.user.Administrator;
import com.emp.prode.model.entity.user.AdministratorPK;
import com.emp.prode.model.entity.user.SystemUser;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class UserManageHistory
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long historyID;
    @Column(name = "date", nullable = false)
    private Timestamp date;
    @ManyToOne
    @JoinColumn(name = "historyUserLogin")
    private SystemUser systemUser;
    @ManyToOne
    @JoinColumn(name = "historyADMLogin")
    private Administrator administrator;
    @Column(name = "operation", nullable = false, updatable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ADMOperation operation;

    public UserManageHistory() {}

    public UserManageHistory(Timestamp date, String historyUserLogin, String historyADMLogin, ADMOperation operation) {
        this.date = date;
        this.systemUser = new SystemUser();
        this.systemUser.setUserLogin(historyUserLogin);
        this.administrator = new Administrator();
        this.administrator.setAdministratorPK(new AdministratorPK(historyADMLogin));
        this.operation = operation;
    }

    public Long getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Long historyID) {
        this.historyID = historyID;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }

    public ADMOperation getOperation() {
        return operation;
    }

    public void setOperation(ADMOperation operation) {
        this.operation = operation;
    }
}
