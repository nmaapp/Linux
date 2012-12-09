/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.gui.wizard;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.syncany.config.Config;
import org.syncany.config.Encryption;
import org.syncany.config.Profile;
import org.syncany.config.Repository;
import org.syncany.exceptions.ConfigException;
import org.syncany.gui.settings.SettingsPanel;

/**
 *
 * @author pheckel
 */
public class EncryptionPanel extends SettingsPanel {
    private Profile profile;
    private ResourceBundle resourceBundle;
    
    /** Creates new form EncryptionPanel */
    public EncryptionPanel(Profile profile) {
    	resourceBundle = Config.getInstance().getResourceBundle();
        initComponents();

        pnlAdvancedSettings.setVisible(false);
        this.profile = profile;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel4 = new javax.swing.JLabel();
                txtPassword1 = new javax.swing.JPasswordField();
                txtPassword = new javax.swing.JPasswordField();
                chkAdvancedSettings = new javax.swing.JCheckBox();
                pnlAdvancedSettings = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                cmbCipher = new javax.swing.JComboBox();
                cmbKeylength = new javax.swing.JComboBox();
                jLabel6 = new javax.swing.JLabel();
                spnChunksize = new javax.swing.JSpinner();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();

                jLabel4.setText(resourceBundle.getString("encryp_password"));
                jLabel4.setName("jLabel4"); // NOI18N

                txtPassword1.setName("txtPassword1"); // NOI18N

                txtPassword.setName("txtPassword"); // NOI18N

                chkAdvancedSettings.setText(resourceBundle.getString("encryp_advanced_encryption_settings"));
                chkAdvancedSettings.setName("chkAdvancedSettings"); // NOI18N
                chkAdvancedSettings.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chkAdvancedSettingsActionPerformed(evt);
                        }
                });

                pnlAdvancedSettings.setBorder(null);
                pnlAdvancedSettings.setName("pnlAdvancedSettings"); // NOI18N

                jLabel5.setText(resourceBundle.getString("encryp_chipher"));
                jLabel5.setName("jLabel5"); // NOI18N

                cmbCipher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AES", "3DES" }));
                cmbCipher.setName("cmbCipher"); // NOI18N

                cmbKeylength.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "128", "192" }));
                cmbKeylength.setName("cmbKeylength"); // NOI18N

                jLabel6.setText(resourceBundle.getString("encryp_key_length"));
                jLabel6.setName("jLabel6"); // NOI18N

                spnChunksize.setModel(new javax.swing.SpinnerNumberModel(512, 32, 2048, 32));
                spnChunksize.setName("spnChunksize"); // NOI18N

                jLabel7.setText(resourceBundle.getString("encryp_chunk_size"));
                jLabel7.setName("jLabel7"); // NOI18N

                javax.swing.GroupLayout pnlAdvancedSettingsLayout = new javax.swing.GroupLayout(pnlAdvancedSettings);
                pnlAdvancedSettings.setLayout(pnlAdvancedSettingsLayout);
                pnlAdvancedSettingsLayout.setHorizontalGroup(
                        pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdvancedSettingsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spnChunksize, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(cmbKeylength, javax.swing.GroupLayout.Alignment.TRAILING, 0, 247, Short.MAX_VALUE)
                                        .addComponent(cmbCipher, 0, 247, Short.MAX_VALUE))
                                .addContainerGap())
                );
                pnlAdvancedSettingsLayout.setVerticalGroup(
                        pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlAdvancedSettingsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbCipher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cmbKeylength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAdvancedSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(spnChunksize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jLabel8.setText(resourceBundle.getString("encryp_confirm_message_part1"));
                jLabel8.setName("jLabel8"); // NOI18N

                jLabel11.setText(resourceBundle.getString("encryp_confirm_message_part2"));
                jLabel11.setName("jLabel11"); // NOI18N

                jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getStyle() | java.awt.Font.BOLD, jLabel9.getFont().getSize()+3));
                jLabel9.setText(resourceBundle.getString("encryp_choose_password"));
                jLabel9.setName("jLabel9"); // NOI18N

                jLabel10.setText(resourceBundle.getString("encryp_info"));
                jLabel10.setName("jLabel10"); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11))
                                                .addGap(59, 59, 59))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pnlAdvancedSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(chkAdvancedSettings)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel8))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))))
                                                .addGap(49, 49, 49))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(chkAdvancedSettings)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlAdvancedSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(69, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void chkAdvancedSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdvancedSettingsActionPerformed
        pnlAdvancedSettings.setVisible(chkAdvancedSettings.isSelected());
}//GEN-LAST:event_chkAdvancedSettingsActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JCheckBox chkAdvancedSettings;
        private javax.swing.JComboBox cmbCipher;
        private javax.swing.JComboBox cmbKeylength;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel pnlAdvancedSettings;
        private javax.swing.JSpinner spnChunksize;
        private javax.swing.JPasswordField txtPassword;
        private javax.swing.JPasswordField txtPassword1;
        // End of variables declaration//GEN-END:variables


    @Override
    public void load() {

    }

    @Override
    public void save() {
        // Encryption
        Encryption encryption = new Encryption();

        encryption.setPassword(new String(txtPassword.getPassword()));
        encryption.setKeylength(Integer.parseInt(cmbKeylength.getSelectedItem().toString()));
        encryption.setCipherStr(cmbCipher.getSelectedItem().toString());

        try {
            encryption.init(); // TODO do this differently
        }
        catch (ConfigException ex) {
            Logger.getLogger(ConnectionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Repo
        Repository repository = profile.getRepository();

        repository.setChunkSize((Integer) spnChunksize.getValue());
        repository.setEncryption(encryption);
    }
}
