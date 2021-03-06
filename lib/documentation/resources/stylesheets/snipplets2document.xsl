<?xml version="1.0"?>
<!--
   ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   ====================================================================
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="p[@id='helpwanted']">
        <div style="width: 80%;" type="helpwanted" project="poi" description="the Apache POI Project">
            <!-- TODO Link to the POI-specific tasks -->
            <em>To view the <a href="https://helpwanted.apache.org/">"Help Wanted"
            </a> tasks, an internet connection is required.
            </em>
        </div>
        <script src="https://helpwanted.apache.org/widget.js" type="text/javascript"></script>
    </xsl:template>

    <!-- the obligatory copy-everything -->
    <xsl:template match="node() | @*">
        <xsl:copy>
            <xsl:apply-templates select="@*"/>
            <xsl:apply-templates/>
        </xsl:copy>
    </xsl:template>
</xsl:stylesheet>
