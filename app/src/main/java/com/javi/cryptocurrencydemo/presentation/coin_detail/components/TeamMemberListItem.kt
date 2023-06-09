package com.javi.cryptocurrencydemo.presentation.coin_detail.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javi.cryptocurrencydemo.data.model.TeamMember

@Composable
fun TeamMemberListItem(teamMember: TeamMember) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = teamMember.name,
            color = Color.White,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = teamMember.position,
            color = Color.White,
            fontStyle = FontStyle.Italic
        )
        Spacer(modifier = Modifier.size(4.dp))
        Divider()
        Spacer(modifier = Modifier.size(4.dp))
    }
}

@Preview
@Composable
private fun TeamMemberListItemPreview() {
    TeamMemberListItem(TeamMember.mock())
}