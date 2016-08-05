/*
    Copyright 2012 The Whitehole team

    This file is part of Whitehole.

    Whitehole is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free
    Software Foundation, either version 3 of the License, or (at your option)
    any later version.

    Whitehole is distributed in the hope that it will be useful, but WITHOUT ANY 
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
    FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along 
    with Whitehole. If not, see http://www.gnu.org/licenses/.
*/

package whitehole;

public class SettingsForm extends javax.swing.JDialog
{
    public SettingsForm(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        chkObjectDBUpdate = new javax.swing.JCheckBox();
        chkUseShaders = new javax.swing.JCheckBox();
        chkFastDrag = new javax.swing.JCheckBox();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        lblObjectDatabase = new javax.swing.JLabel();
        lblRendering = new javax.swing.JLabel();
        radKuribo64 = new javax.swing.JRadioButton();
        radNeoMarioGalaxy = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        chkObjectDBUpdate.setText("Check for object database updates on startup");
        chkObjectDBUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        chkUseShaders.setText("Use shaders for 3D rendering");
        chkUseShaders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUseShadersActionPerformed(evt);
            }
        });

        chkFastDrag.setText("Render objects in low-res when dragging");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblObjectDatabase.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblObjectDatabase.setText("Object database");

        lblRendering.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRendering.setText("Rendering");

        buttonGroup1.add(radKuribo64);
        radKuribo64.setText("Kuribo64");

        buttonGroup1.add(radNeoMarioGalaxy);
        radNeoMarioGalaxy.setText("Neo Mario Galaxy");

        jLabel1.setText("Select a server to download the database from:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblObjectDatabase))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkUseShaders)
                                    .addComponent(chkFastDrag))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radKuribo64)
                    .addComponent(chkObjectDBUpdate)
                    .addComponent(lblRendering)
                    .addComponent(jLabel1)
                    .addComponent(radNeoMarioGalaxy))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblRendering)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkUseShaders, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkFastDrag)
                .addGap(23, 23, 23)
                .addComponent(lblObjectDatabase)
                .addGap(1, 1, 1)
                .addComponent(chkObjectDBUpdate)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radKuribo64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radNeoMarioGalaxy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        chkObjectDBUpdate.setSelected(Settings.objectDBUpdate);
        chkUseShaders.setSelected(Settings.useShaders);
        chkFastDrag.setSelected(Settings.fastDrag);
        radKuribo64.setSelected(Settings.dbKuribo64);
        radNeoMarioGalaxy.setSelected(Settings.dbEggStarGalaxy);
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        Settings.objectDBUpdate = chkObjectDBUpdate.isSelected();
        Settings.useShaders = chkUseShaders.isSelected();
        Settings.fastDrag = chkFastDrag.isSelected();
        Settings.dbKuribo64 = radKuribo64.isSelected();
        Settings.dbEggStarGalaxy = radNeoMarioGalaxy.isSelected();
        Settings.save();
        dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    private void chkUseShadersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUseShadersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkUseShadersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkFastDrag;
    private javax.swing.JCheckBox chkObjectDBUpdate;
    private javax.swing.JCheckBox chkUseShaders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblObjectDatabase;
    private javax.swing.JLabel lblRendering;
    private javax.swing.JRadioButton radKuribo64;
    private javax.swing.JRadioButton radNeoMarioGalaxy;
    // End of variables declaration//GEN-END:variables
}
