/**
 * Copyright (c) 2008-2011 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://www.sonatype.com/products/nexus/attributions.
 *
 * This program is free software: you can redistribute it and/or modify it only under the terms of the GNU Affero General
 * Public License Version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License Version 3
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License Version 3 along with this program.  If not, see
 * http://www.gnu.org/licenses.
 *
 * Sonatype Nexus (TM) Open Source Version is available from Sonatype, Inc. Sonatype and Sonatype Nexus are trademarks of
 * Sonatype, Inc. Apache Maven is a trademark of the Apache Foundation. M2Eclipse is a trademark of the Eclipse Foundation.
 * All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.plugin.discovery;

public class NexusConnectionInfo
{

    private final String nexusUrl;

    private String user;

    private String password;

    private String connectionName;

    private String connectionId;

    public NexusConnectionInfo( final String url )
    {
        this.nexusUrl = url;
    }

    public NexusConnectionInfo( final String url, final String username, final String password,
                                final String connectionName, final String connectionId )
    {
        nexusUrl = url;
        user = username;
        this.password = password;
        this.connectionName = connectionName;
        this.connectionId = connectionId;
    }

    public NexusConnectionInfo( final String url, final String username, final String password )
    {
        nexusUrl = url;
        user = username;
        this.password = password;
    }

    public boolean isConnectable()
    {
        return nexusUrl != null && user != null && password != null;
    }

    public NexusConnectionInfo setPassword( final String password )
    {
        this.password = password;
        return this;
    }

    public String getConnectionName()
    {
        return connectionName;
    }

    public String getNexusUrl()
    {
        return nexusUrl;
    }

    public String getUser()
    {
        return user;
    }

    public String getPassword()
    {
        return password;
    }

    public NexusConnectionInfo setUser( final String user )
    {
        this.user = user;
        return this;
    }

    public NexusConnectionInfo setConnectionName( final String name )
    {
        this.connectionName = name;
        return this;
    }

    public String getConnectionId()
    {
        return connectionId;
    }

    public NexusConnectionInfo setConnectionId( final String connectionId )
    {
        this.connectionId = connectionId;
        return this;
    }

}
